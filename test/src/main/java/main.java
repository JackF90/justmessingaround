import javax.swing.*;

public class main {

    public static void main(String args[]) {

        String name, spec, selectionString;
        String age, mana, health, level, xp;

        name = String.valueOf(JOptionPane.showInputDialog("Enter name"));


        selectionString = showMenu();

        Person person = new Person();

        if(selectionString == "Warrior"){
            person.setAge(20);
            person.setSpecialization("Warrior");
            person.setHealth(200);
            person.setMana(0);
            person.setLevel(1);
            person.setExperience(0);
            person.setName(name);
        }

        else if(selectionString == "Mage"){
            person.setAge(20);
            person.setSpecialization("Mage");
            person.setHealth(100);
            person.setMana(300);
            person.setLevel(1);
            person.setExperience(0);
            person.setName(name);
        }

        else if (selectionString == "Priest"){
            person.setAge(20);
            person.setSpecialization("Priest");
            person.setHealth(120);
            person.setMana(200);
            person.setLevel(1);
            person.setExperience(0);
            person.setName(name);

        }
        
        System.out.println(person.toString());


    }

    public static String showMenu(){
        //i solved my problem adding the following 2 lines of code...
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] options = {"Warrior", "Mage", "Priest"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }

}


