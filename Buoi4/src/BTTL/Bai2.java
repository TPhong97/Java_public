package BTTL;

public class Bai2 {

//    1. Cập nhật class Student:
    //    Đặt hai thuộc tính name và age thành private
    //    Viết constructor có hai tham số (String name, int age)
    //    Viết các phương thức:
    //    public String getName()
    //    public void setName(String name)
    //    public int getAge()
    //    public void setAge(int age)
//    2.Trong phương thức main():
    //    Tạo một đối tượng Student bằng constructor
    //    Sử dụng setName() và setAge() để thay đổi thông tin
    //    Sử dụng getName() và getAge() để in ra màn hình tên và tuổi mới

    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age ;
        }


    }
    public static void main (String[] agr ){
        Student st = new Student("Phong", 20);

        st.setName("phong");
        st.setAge(21);

        System.out.println("Tên mới : " + st.getName());
        System.out.println("Tuổi mới : " + st.getAge());

    }

}
