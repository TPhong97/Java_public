package BTTL;

public class Bai3 {

//    Tạo class Car với hai thuộc tính:
//    String brand
//    int maxSpeed
//    Viết constructor để khởi tạo cả hai thuộc tính trên
//    Viết phương thức không trả về run() để in ra màn hình:
//    Xe [brand] đang chạy với tốc độ tối đa [maxSpeed] km/h
//    Trong phương thức main():
//    Tạo một đối tượng Car
//    Gọi phương thức run() để kiểm tra kết quả

    public static class Car {
        public String brand;
        public int maxSpeed;

        public  Car (String brand, int maxSpeed){
            this.brand = brand;
            this.maxSpeed = maxSpeed;
        }

        public void run(){
            System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h");
        }

    }

    public static void main (String[] agr){
        Car c = new Car("ferrari", 400);
        c.run();
    }


}
