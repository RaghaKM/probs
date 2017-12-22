/**
 * 
 */

var array = [1,2,3,4,5];
var size = array.length;
(function theLoop (i) {
   // alert(size);
  setTimeout(function () {
    alert(array[size-i]);
    if (--i) {          // If i > 0, keep going
      theLoop(i);       // Call the loop again, and pass it the current value of i
    }
  }, 31000);
})(size);