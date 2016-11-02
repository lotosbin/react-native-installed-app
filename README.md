# react-native-installed-app
react native for  check app install status


# sample
[react-native-installed-app-sample](https://github.com/lotosbin/react-native-installed-app-sample)

# usage
```
npm install -S https://github.com/lotosbin/react-native-installed-app.git
```
```ecmascript 6 
import {Platform} from 'react-native';
import InstalledApp from 'react-native-installed-app'; 

var name = ''; 
if(Platform.OS === 'ios'){ 
  name = 'schemaurl like fb://'; 
}else{ 
  name = 'package name like com.lotos.reactnative.installedapp'; 
}

InstallApp.isApplicationInstalled(name) 
.then(installed=>{ console.log(${name}:${installed}) }) 
.done();
```
