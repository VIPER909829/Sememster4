import java.util.*;

class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

public class HuffmanCoding {
    public static Node buildTree(Map<Character, Integer> freqMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.freq));

        // Add all characters with their frequencies to the queue
        for (var entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Construct the Huffman Tree
        while (pq.size() > 1) {
            Node left = pq.poll(), right = pq.poll();
            Node merged = new Node('\0', left.freq + right.freq);
            merged.left = left;
            merged.right = right;
            pq.add(merged);
        }
        return pq.poll();  // Root of the Huffman Tree
    }

    public static void generateCodes(Node root, String code, Map<Character, String> codes) {
        if (root == null) return;
        if (root.left == null && root.right == null) codes.put(root.ch, code);
        generateCodes(root.left, code + "0", codes);
        generateCodes(root.right, code + "1", codes);
    }

    public static String encode(String text, Map<Character, String> codes) {
        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            encoded.append(codes.get(c));  // Avoids null values
        }
        return encoded.toString();
    }

    public static String decode(String encoded, Node root) {
        StringBuilder decoded = new StringBuilder();
        Node cur = root;
        for (char bit : encoded.toCharArray()) {
            cur = (bit == '0') ? cur.left : cur.right;
            if (cur.left == null && cur.right == null) {
                decoded.append(cur.ch);
                cur = root;
            }
        }
        return decoded.toString();
    }

    public static void main(String[] args) {
        String text = "fffffeeeeeeeeecccccccccccbbbbbbbbbbbbbddddddddddddddddaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Map<Character, Integer> freqMap = new HashMap<>();

        // FIX: Using a proper way to count character frequency
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        Node root = buildTree(freqMap);
        Map<Character, String> codes = new HashMap<>();
        generateCodes(root, "", codes);

        // Print Huffman codes
        System.out.println("Huffman Codes: " + codes);

        // Encode and Decode
        String encoded = encode(text, codes);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decode(encoded, root));
    }
}
/*OUTPUT:PS C:\Users\Tc\OneDrive\Desktop\Build up logic thinking> cd "c:\Users\Tc\AAD2 ASSIGNMENT5\" ; if ($?) { javac HuffmanCoding.java } ; if ($?) { java HuffmanCoding }
Huffman Codes: {a=0, b=101, c=100, d=111, e=1101, f=1100}
Encoded: 11001100110011001100110111011101110111011101110111011101100100100100100100100100100100100101101101101101101101101101101101101101111111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000
Decoded: fffffeeeeeeeeecccccccccccbbbbbbbbbbbbbddddddddddddddddaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
PS C:\Users\Tc\AAD2 ASSIGNMENT5> */