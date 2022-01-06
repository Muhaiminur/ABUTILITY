
# ABUTILITY

Use this library for every project to use basic feature

## Description

Show Dialog/Set local Shared preference/Hide Views/Open Dialpad

## Getting Started

### Installing

How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Muhaiminur:ABUTILITY:Tag'
	}

### Executing program

* Import this line to class
```
import com.abir.utility.Utility;
```


* Use this in Mainclass

```

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utility utility = new Utility(this);
        utility.showDialog("1234");
    }
}

```


## License

This project is licensed under the [NAME HERE] License - see the LICENSE.md file for details
