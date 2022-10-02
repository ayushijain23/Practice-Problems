package Tree;

// https://www.geeksforgeeks.org/find-distance-between-two-nodes-of-a-binary-tree/

    public class GoogleInterview{
        static Nodee root;

        public static class Nodee {
            int val;
            Nodee left;
            Nodee right;

            public Nodee(int val) {
                this.val = val;
                this.left = null;
                this.right = null;
            }
        }

        public static Nodee getLCA(Nodee root, int a , int b){
            if(root == null)
                return null;

            if(root.val < a && root.val < b){
                return getLCA(root.right, a, b);
            }
            else if(root.val > a  && root.val > b){
                return getLCA(root.left, a, b);
            }
            return root;
        }

        public static int getNodeeDis(Nodee lca, int a, int height){
            if(lca == null){
                return -1;
            }

            if(lca.val == a)
            {
                return height;
            }

            int leftH = getNodeeDis(lca.left, a, height + 1);
            if(leftH == -1)
                return getNodeeDis(lca.right, a, height + 1);
            return leftH;
        }
        public static int findDistance(Nodee root, int a, int b){
            Nodee lca = getLCA(root, a, b);
            int dist1 = getNodeeDis(lca, a, 0);
            int dist2 = getNodeeDis(lca, b, 0);
            return dist1 + dist2;
        }

        public static void main(String args[]){
            root = new Nodee(5);
            root.left = new Nodee(2);
            root.right = new Nodee(12);
            root.left.left= new Nodee(1);
            root.left .right= new Nodee(3);
            root.right.left= new Nodee(9);
            root.right.right = new Nodee(21);

            int distance =  findDistance(root, 2, 9 );
            System.out.println(distance);

        }
    }

