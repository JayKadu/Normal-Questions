//693. Binary Number with Alternating Bits
// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
//1
class Solution {
    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        Boolean output = true;
        for(int i=0;i<bits.length();i++){
            if(i==(bits.length()-1)){
                break;
            }
            if(bits.charAt(i) == bits.charAt(i+1)){
                output = false;
            }
        }
        return output;
    }
}
//2
class Solution {
    public boolean hasAlternatingBits(int n) {
        int previousBit = -1;
        while(n != 0){
            int currentBit = n & 1;
            if( previousBit == currentBit ){
                return false;
            }
            previousBit = currentBit;
            n >>= 1;
        }
        return true;
    }
}
