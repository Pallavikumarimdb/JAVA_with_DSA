//832. Flipping an Image
//https://leetcode.com/problems/flipping-an-image/description/

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
    For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    For example, inverting [0,1,1] results in [1,0,0].


Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */

public class LeetCode_FlippinganImage {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length; i++){
            int len=image[i].length-1;
            for(int j=0; j<image[i].length/2; j++){
                int temp=image[i][j];
                image[i][j]=image[i][len]^1;
                image[i][len]=temp^1;
                len--;
            }
            if(image[i].length%2!=0){
                image[i][(image[i].length/2)]=image[i][(image[i].length/2)]^1;
            }
        }
        return image;
    }
}
