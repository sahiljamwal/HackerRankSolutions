let btn=document.querySelector('#btn');

btn.addEventListener('click',()=>{
    let value=btn.innerHTML;
    btn.innerHTML=++value;
  });
