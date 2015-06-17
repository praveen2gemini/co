# Cordova CustomToast Plugin

Simple plugin that returns your string prefixed with hello.

Greeting a user with "CustomToast" is something that could be done in JavaScript. This plugin provides a simple example demonstrating how Cordova plugins work.

## Using
Clone the plugin

    $ git clone https://github.com/praveen2gemini/cordova-plugin-mytoast.git

Create a new Cordova Project

    $ cordova create CustomToast com.custom.CustomToast MyToast
    
Install the plugin

    $ cd CustomToast
    $ cordova plugin install ../cordova-plugin-mytoast
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Hello Plugin");
    }

    hello.greet("World", success, failure);
```

Install iOS or Android platform

    cordova platform add ios
    cordova platform add android
    
Run the code

    cordova run 

## More Info

For more information on setting up Cordova see [the documentation](http://cordova.apache.org/docs/en/4.0.0/guide_cli_index.md.html#The%20Command-Line%20Interface)

For more info on plugins see the [Plugin Development Guide](http://cordova.apache.org/docs/en/4.0.0/guide_hybrid_plugins_index.md.html#Plugin%20Development%20Guide)