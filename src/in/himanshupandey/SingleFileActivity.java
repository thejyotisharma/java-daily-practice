package in.himanshupandey;

//public class SingleFileActivity {
//
//    public static void togetRooms() {
//        boolean[][] arr = new boolean[10][26];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = false;
//            }
//        }
//        printArray(arr);
//    }
//
//    private static void printArray(boolean[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            char c = 'A';
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(i + "" + c + "/" + arr[i][j] + " ");
//                c++;
//            }
//            System.out.println("");
//        }
//    }
//
//
//
//
// You are a receptionist at a hotel which has 10 floors, numbered from 0 to 9 and each floor has 26rooms named from 'A' to 'Z'. Being a receptionist your task is to handle booking queries.

// Take the input from user for booking in below format:

// For a room, the first character represents the floor of the room i.e. 0 to 9. The second character represents the room name i.e. A to Z.
// agaist the room number, the name of primary customer for that booking should be saved.

// so, a room say B on 1st floor is represented as: 1B
// if Ram is the customer who has booked the room, then it should be saved as
// 1B, Ram.

// user can checkout from the room. once checkedout, delete the booking entry for that room.

// lets say booking details now is:
// 1B, Ram
// 2A, Shyam
// 3D, Kavita
// 4A, Preeti

// If priti wants to checkout then, remaining details left will be:
// 1B, Ram
// 2A, Shyam
// 3D, Kavita

// 1. Create a 2D array to store all the rooms. e.g..
// if floor is from 0-2 and rooms named as 'A' to 'C'
// 2D array will be:

// 0A	0B	0C
// 1A	1B	1C
// 2A	2B	2C
// 2. Write a function to print the 2D array of all hotel rooms.
// 3. On booking each room, you collect 1 coin from the customer. Write a function to return total coins collected. Please note that the coin count will not decrease in case of checkout.
// 4. write function to return total count of active booking.
// 5. Write a function to print the rooms which are currently booked and the customer and the name of the customer.
// 6. Write a function to take customerName as input and then checkout the same customer from the hotel.
// 7. write function to return room number of customer, if name is provided.
// 8. write function to return name of customer, if room number is provided.

