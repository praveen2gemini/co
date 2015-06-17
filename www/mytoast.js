
module.exports = {
    my_toast: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MyToast", "my_toast", [name]);
    }
};