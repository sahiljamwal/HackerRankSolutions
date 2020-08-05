
function getMaxLessThanK(n,k){
    let max=0;
    for(let i=1;i<=n;i++ ){
        for(let j=i+1;j<=n;j++){
            let AND=i&j;
            if(AND < k && AND>max){
                max=AND;
            }
        }
    }
    return max;
}
