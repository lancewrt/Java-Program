/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lance
 */
class Room {
    int roomno;
    String roomtype;
    float roomrarea;
    String ACmachine;

    void setdata(int rnumber, String rtype, float rarea, String checkAC) {
        roomno = rnumber;
        roomtype = rtype;
        roomrarea = rarea;
        ACmachine = checkAC;
    }

    void displaydata() {
        System.out.println("Room No:  " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room area: " + roomrarea);
        System.out.println("AC Type: " + ACmachine);
    }

    public static void main(String arg[]) {
        Room myRoom = new Room();
        myRoom.setdata(10, "Villa", 1000f, "Inverter");
        myRoom.displaydata();
    }
}