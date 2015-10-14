function showName(firstname, lastname) {
    var nameIntro = "Your name is";
    function makefullName() {
        return nameIntro + " " + firstname + ", " + lastname;
    }
    return makefullName();
}

function init() {
    document.getElementById("div1").innerHTML = showName("Barack", "Obama");
    var mId=celebrityID();
    console.log(mId);
    console.log(mId.getId());
    mId.setId(123);
    console.log(mId.getId());



}

function celebrityID() {
    var celebrityId = 999;
    return {
        getId: function () {
            return celebrityId;
        },
        setId: function (newid) {
            celebrityId = newid;
        }
    }
}

function celebrityIDCreator (theCelebrities) {
    var i;
    var uniqueID = 100;
    for (i = 0; i < theCelebrities.length; i++) {
        theCelebrities[i]["id"] = function ()  {
            return uniqueID + i;
        }
    }

    return theCelebrities;
}
​