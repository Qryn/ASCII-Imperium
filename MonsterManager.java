import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MonsterManager {
        List<Monster> lvl1List = new ArrayList<>();
        List<Monster> lvl2List = new ArrayList<>();
        List<Monster> lvl3List = new ArrayList<>();
        List<Event> eventList = new ArrayList<>();
        public void add1(Monster monster) { lvl1List.add(monster);}
        public void add2(Monster monster) { lvl2List.add(monster); }
        public void add3(Monster monster) { lvl3List.add(monster); }
        public void addEvent(Event event) { eventList.add(event); }

        public Monster getlvl1Monster(){
            Collections.shuffle(lvl1List);
                    return lvl1List.get(0);
                }
        public Monster getlvl2Monster(){
            Collections.shuffle(lvl2List);
            return lvl2List.get(0);
        }

        public Monster getlvl3Monster(){
            Collections.shuffle(lvl3List);
            return lvl3List.get(0);
        }
        public Event getEvent(){
          Collections.shuffle(eventList);
          return eventList.get(0);
        }
}

