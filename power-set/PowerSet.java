class PowerSet{
    // Print all subsets of the given set
    static void printSubsets(char set[]){
        int n = set.length;

        // Total subsets = 2^n = (1 << n)
        for (int i = 0; i < (1 << n); i++){
            System.out.print("{");

            // Print current subset
            for (int j = 0; j < n; j++){

                /* (1<<j) is a number with jth bit 1 so when we '&' it with
                 * the subset number we get the numbers that are present in the
                 * subset
                 */
                int isPresent = i & (1 << j);
                if (isPresent > 0){
                    System.out.print(set[j]);
                }
            }
            System.out.print("} ");
        }
    }

    // Tester
    public static void main(String[] args){
        char set1[]= { 'a', 'b'};
        System.out.println("Set1 = {a, b}");
        printSubsets(set1);
        System.out.println("\n................");
        char set2[]= { 'a', 'b', 'c'};
        System.out.println("Set2 = {a, b, c}");
        printSubsets(set2);
        System.out.println("\n................");
        char set3[]= { 'a', 'b', 'c', 'd'};
        System.out.println("Set3 = {a, b, c, d}");
        printSubsets(set3);
    }
}
