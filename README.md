# FullTextContent
TextView的内容中轻松加入图片


[![](https://jitpack.io/v/LiuLinXin/FullTextContent.svg)](https://jitpack.io/#LiuLinXin/FullTextContent)

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.LiuLinXin:FullTextContent:-SNAPSHOT'
	}
  
  use eg.
  ImgInText.setText(tvText3, "社会文明${}与科技发展${}是可以兼顾的", true, R.mipmap.robot, R.mipmap.arbre);
  
  
  
  ![usage pic](./show/ImgInText.png)
