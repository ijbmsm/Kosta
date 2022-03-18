package day0318;

public class Book {
        private String title;
        private int price;
        private static int count;

        public Book(String title, int price) {
            this.title = title;
            this.price = price;
            count++;
        }

        void print(){
            System.out.println("title = " + title);
            System.out.println("price = " + price);
        }

        int getCount(){
            return count;
        }
}
