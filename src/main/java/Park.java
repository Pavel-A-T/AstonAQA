public class Park {
    public static void main(String[] args) {
        Attraction attr = new Park().new Attraction("Горки", "10:00 - 18:00", 1000);
        System.out.println(attr);
    }

    private class Attraction {
        private String name;
        private String time;
        private int price;

        public Attraction(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", time='" + time + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
