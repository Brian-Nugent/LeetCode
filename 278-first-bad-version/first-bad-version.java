/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int pos = n/2;
        int start = 0;
        int end = n;
        
        while(start < end-1){
            pos = start + (end - start)/2;
            if(!isBadVersion(pos))
                start = pos;
            else
                end = pos;
        }

    if(isBadVersion(start))
        return start;
    return start + 1;
    }
}