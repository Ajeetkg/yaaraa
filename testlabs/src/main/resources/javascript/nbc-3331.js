/**
 * Created by agupta2 on 8/28/15.
 */

function init() {
    setArray();
}

function setArray() {
    var stooges = [{name: 'moe', age: 40}, {name: 'larry', age: 50}, {name: 'curly', age: 60}];

    var key_values = _.each(stooges,
        function (stooge) {
            return (stooge.name + " : " + stooge.age);
        });

    var max = _.max(key_values, function (key_value) {
        return key_value.age;
    });


    var test=[0]
    document.getElementById("div2").innerHTML = max.age;

}


