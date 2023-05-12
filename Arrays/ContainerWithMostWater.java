public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length -1;
        int maxvolume =0;
        while(l<r){
            int volume =0;
            if(height[l]<height[r]){
                volume = height[l]*(r-l);
                l++;
            }
            else if(height[r]<height[l]){
                volume = height[r]*(r-l);
                r--;
            }
            else{
                volume = height[r]*(r-l);
                l++;
            }
            if(volume>maxvolume){
                maxvolume = volume;
            }
        }
        return maxvolume;
    }
    
}
