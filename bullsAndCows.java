class bullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int n=0;
        int arr[]=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))bulls++;
        }
        int cows=0;
        for(int i=0;i<secret.length();i++){
            n=secret.charAt(i)-'0';
            arr[n]++;
        }
        
        for(int i=0;i<secret.length();i++){
            n=guess.charAt(i)-'0';
        if(arr[n]!=0){cows++;arr[n]--;
        
        }}
        return bulls+"A"+(cows-bulls)+"B";
    }
}