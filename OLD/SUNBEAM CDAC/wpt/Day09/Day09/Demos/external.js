//below myfetch code is same as :
//fetch function in Vanilla Javascript
//axios function in React JS
//saga in React JS
//thunk in React JS
//services in Angular JS
function myfetch(method, url) {

  return new Promise(function (resolve, reject) {
    var helper = new XMLHttpRequest();
    helper.onreadystatechange = function () {
      if (helper.readyState == 4 && helper.status == 200) {
        resolve(helper.responseText); //here we are sending data to promise object's resolve method
      }
    };
    helper.open(method, url);
    helper.send();
  });
}
