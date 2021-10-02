int diameter(Node root) {
        
        Info info = findDiameter(root);
        return info.diameter+1;
    }
    
    Info findDiameter(Node root){
        if(root==null) return new Info(-1, -1);
        Info leftInfo= findDiameter(root.left);
        Info rightInfo= findDiameter(root.right);
        
        int h= Math.max(leftInfo.height, rightInfo.height)+1;
        int d= leftInfo.height+rightInfo.height+2;
        
        int dia= Math.max(d, Math.max(leftInfo.diameter, rightInfo.diameter));
        return new Info(h,dia);
    }
    static class Info{
        int height;
        int diameter;
        Info(int height, int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
