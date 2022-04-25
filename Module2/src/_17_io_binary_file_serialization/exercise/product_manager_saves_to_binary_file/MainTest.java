package _17_io_binary_file_serialization.exercise.product_manager_saves_to_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static class ReadAndWriteProduct {
        public static void write(String path, Object obj) {
            File file = new File(path);
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(path);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(obj);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static List<Product> read(String path) {

            File file = new File(path);
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            Object object = null;
            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                object = objectInputStream.readObject();
                return (List<Product>) object;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }

    public static Scanner input = new Scanner(System.in);
    public static List<Product> myList = new ArrayList<>();
    public static final String FILE1 = "Module2\\src\\_17_io_binary_file_serialization\\exercise\\product_manager_saves_to_binary_file\\ListProduct.txt";
    int size = 0;

    public static void main(String[] args) {

        myList.add(new Product(1, "Iphone", "Apple", 1000));
        myList.add(new Product(2, "XiaoMi", "Mi", 2000));
        myList.add(new Product(3, "HK Phone", "HK", 3000));
        myList.add(new Product(4, "SamSung", "SS", 4000));
//        System.out.println("Nhập đường dẫn");
//        String path = input.nextLine();
        while (true) {

            System.out.println("1: Thêm sản phẩm ");
            System.out.println("2: Hiển thị sản phẩm");
            System.out.println("3: Tìm kiếm sản phẩm ");
            System.out.println("Chọn");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    find();
                    break;
            }
        }
    }

    public static void display() {
        myList = ReadAndWriteProduct.read(FILE1);
        for (Product item : myList) {
            System.out.println(item);
        }
    }

    public static void add() {
        myList = ReadAndWriteProduct.read(FILE1);
        System.out.println("Nhập ID");
        int id = Integer.parseInt(input.nextLine());
        boolean check = true;
        for (Product item : myList) {
            if (item.getId() == id) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Nhập tên");
            String name = input.nextLine();
            System.out.println("Nhập hãng");
            String manufacturer = input.nextLine();
            System.out.println("Nhập giá");
            int price = Integer.parseInt(input.nextLine());
            myList.add(new Product(id, name, manufacturer, price));
            ReadAndWriteProduct.write(FILE1, myList);
            System.out.println("Da them thanh cong");
        }
    }

    public static void find() {
        myList = ReadAndWriteProduct.read(FILE1);
        System.out.println("Tên sản phẩm");
        String name = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getName().contains(name)) {
                System.out.println(myList.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không có sản phẩm này");
        }
    }
}