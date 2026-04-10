class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            }     
            if(bills[i] == 10){
                if(five >= 1){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            if(bills[i] == 20){
                if(five >= 3){
                    five = five - 3;
                    twenty++;
                }
                else if(five >= 1 && ten >= 1){
                    five--;
                    ten--;
                    twenty++;
                }
                else{
                    return false;
                }
            }
            System.out.println(five + " " + ten + " " + twenty);
        }
        return true;
    }
}