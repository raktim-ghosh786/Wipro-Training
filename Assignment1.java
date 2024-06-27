public class Assignment1<A, B> {
    private A first;
    private B second;

    public Assignment1(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public Assignment1<B, A> reverse() {
        return new Assignment1<>(second, first);
    }

    public static void main(String[] args) {
       Assignment1<String, Integer> a = new Assignment1<>("Raktim", 24);
        System.out.println("Original Pair: " +a.getFirst() + ", " + a.getSecond());
        
        Assignment1<Integer, String> reversedPair = a.reverse();
        System.out.println("Reversed Pair: " + reversedPair.getFirst() + ", " + reversedPair.getSecond());
    }
}