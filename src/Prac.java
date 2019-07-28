public class Prac{
    public static void main(String[] args) {
        System.out.println(eggDropping(2,10));
    }


    public static int eggDropping(int eggs,int floors){
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=floors;i++){
            int stepRes = _eggDropping(eggs,0,i,0,floors);
            System.out.println(stepRes+" "+i);
            if(stepRes<res){
                res = stepRes;
            }
        }
        return res;
    }

    private static int _eggDropping(int eggs,int prevFloor,int presFloor,int tries,int floors){
        if(eggs == 1){
            return presFloor-prevFloor-1+tries;
        }else if(presFloor==floors){
            return tries;
        }else {
            int res = Integer.MIN_VALUE;
            int i=1;
            while (i+presFloor<=floors){
                res = Math.max(_eggDropping(eggs-1,presFloor,presFloor+i,tries+1,floors),_eggDropping(eggs,presFloor
                        ,presFloor+i,tries+1,floors));
                i++;
            }
            return res;

        }
    }
}