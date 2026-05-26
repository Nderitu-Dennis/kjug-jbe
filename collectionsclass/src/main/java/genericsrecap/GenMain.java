package genericsrecap;
class GenMain {
    void main() {
        var box = new Box<Integer>();
        box.setItem(2);
        BoxProcessor.printBoxContents(box);
    }
    class BoxProcessor {
        // ? wildcard
        public static void printBoxContents(Box<? extends Number> box) {
            var item = box.getItem();
            var pow = Box.power(item,8);
            IO.println("box contents is " + item + " raised to pow 2 is " + pow);
        }
    }
    class Box<I> {
        private I item;
        public void setItem(I value) {
            this.item = value;
        }
        public I getItem() {
            return this.item;
        }
        public static <E extends Number,P extends Number> Double power(E item, P pow) {
            IO.println("item " + item + " : " +  pow);
            return Math.pow(item.doubleValue(), pow.doubleValue());
        }
    }
}

