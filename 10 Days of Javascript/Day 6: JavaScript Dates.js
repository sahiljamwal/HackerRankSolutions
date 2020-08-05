

// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName;
    // Write your code here
     let date = new Date(dateString);
     let dayIndex=date.getDay();

      if(dayIndex === 0){
          dayName='Sunday';
      }else if(dayIndex === 1){
          dayName='Monday';
      }else if(dayIndex === 2){
          dayName='Tuesday';
      }else if(dayIndex === 3){
          dayName='Wednesday';
      } else if(dayIndex === 4){
          dayName='Thursday';
      } else if(dayIndex === 5){
          dayName='Friday';
      }else{
          dayName='Saturday';
      }

    
    return dayName;
}

