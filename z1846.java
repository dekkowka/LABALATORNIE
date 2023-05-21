package Timus2;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.InputStream;

public class z1846 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task1846 solver = new Task1846();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1846 {
        final int SIZE = 100000;
        int[] t = new int[SIZE << 2];

        public static int gcd(int a, int b) {
            return (b == 0) ? a : gcd(b, a % b);
        }

        void set(int node, int l, int r, int index, int value) {
            if (index < l || r < index) {
                // return
            } else if (l == r) {
                t[node] = value;
            } else if (l < r) {
                int mid = (l + r) >> 1;
                set(2 * node, l, mid, index, value);
                set(2 * node + 1, mid + 1, r, index, value);
                t[node] = gcd(t[2 * node], t[2 * node + 1]);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Map<Integer, Queue<Integer>> h = new HashMap<>();
            int size = 0;
            int curSize = 0;
            int queries = in.readInt();
            for (int i = 0; i < queries; ++i) {
                String op = in.readString();
                int x = in.readInt();
                if (op.equals("+")) {
                    if (h.containsKey(x)) {
                        h.get(x).add(size);
                    } else {
                        Queue<Integer> q = new ArrayDeque<>();
                        q.add(size);
                        h.put(x, q);
                    }
                    set(1, 0, SIZE - 1, size, x);
                    ++size;
                    ++curSize;
                } else {
                    int index = h.get(x).remove();
                    set(1, 0, SIZE - 1, index, 0);
                    --curSize;
                }
                out.println(curSize == 0 ? 1 : t[1]);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}
