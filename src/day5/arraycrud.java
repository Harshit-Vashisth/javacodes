class Compute {

    public void rotateanticlock(int arr[], int n)
    {
        int temp= arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]= arr[i+1];
        }
        arr[n-1] = temp;
    }
    public void rotateclock(int arr[], int n)
    {
        int temp= arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]= arr[i-1];
        }
        arr[0] = temp;
    }
}