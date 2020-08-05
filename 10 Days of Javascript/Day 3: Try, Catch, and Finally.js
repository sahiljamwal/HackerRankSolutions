

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {

    let str;
    try{
         str=s.split('');
        str=str.reverse();
        str=str.join('');
    }catch(e){
        console.log(e.message);
        return console.log(s);
    }

    console.log(str);
}

