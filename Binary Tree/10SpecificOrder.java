    public static void printNodes(Node root)
    {
        // return if the tree is empty
        if (root == null) {
            return;
        }
 
        // print the root node
        System.out.print(root.key + " ");
 
        // create two empty queues and enqueue root's left and
        // right child, respectively
        Queue<Node> first = new ArrayDeque<>();
        first.add(root.left);
 
        Queue<Node> second = new ArrayDeque<>();
        second.add(root.right);
 
        // loop till queue is empty
        while (!first.isEmpty())
        {
            // calculate the total number of nodes at the current level
            int n = first.size();
 
            // process every node of the current level
            while (n-- > 0)
            {
                // dequeue front node from the first queue and print it
                Node x = first.poll();
 
                System.out.print(x.key + " ");
 
                // enqueue left and right child of `x` to the first queue
                if (x.left != null) {
                    first.add(x.left);
                }
 
                if (x.right != null) {
                    first.add(x.right);
                }
 
                // dequeue front node from the second queue and print it
                Node y = second.poll();
 
                System.out.print(y.key + " ");
 
                // enqueue right and left child of `y` to the second queue
                if (y.right != null) {
                    second.add(y.right);
                }
 
                if (y.left != null) {
                    second.add(y.left);
                }
            }
        }
    }
