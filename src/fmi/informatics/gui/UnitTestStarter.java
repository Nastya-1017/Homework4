package fmi.informatics.gui;

import static fmi.informatics.gui.PersonDataGUI.getPeople;

public class UnitTestStarter {
    public static void main(String[] args) {

        GUIUnitTest.peopleCountTester(getPeople().length);
        GUIUnitTest.studentCountTester(getPeople());
    }
}
