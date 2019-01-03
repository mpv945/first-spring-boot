# first-spring-boot
我的第一个vscode开发

# 环境搭建
  1. 安装vs的boot插件Spring Initializr Java Support;安装Java Extension Pack 和Language support for Java（Red Hat出的插件）对java支持；安装Maven for Java；然后使用Gradle本地配置号Gradle就能运行，在设置--用户设置 搜索gradle 看看导入配置是否勾选上。如果需要调试请安装 Java Debugger
  2. 文件---》首选项--》设置--》用户设置加入如下内容：
    "java.home": "D:\\soft\\java\\jdk1.8.0_152",//jdk目录
    "java.configuration.maven.userSettings": "D:\\soft\\apache-maven-3.5.2\\conf\\settings.xml",//maven配置
    "maven.terminal.useJavaHome": true,
    "maven.executable.path": "D:\\soft\\apache-maven-3.5.2\\bin\\mvn.cmd",//maven运行文件
    "maven.terminal.customEnv": [//自定义环境变量
        {"environmentVariable": "JAVA_HOME",
        "value": "D:\\soft\\java\\jdk1.8.0_152"}
    ]
    配置完成重启 VSCode
  3. ctrl+shift+p 搜索spring 就可以像idea一样设置项目初始化步骤。最后选择生成到哪个目录。生成完点击open 就能打开项目，如果需要debug，打开调试选择带红点的设置按钮就能生成调试luanch.json 一个是单文件运行，一个是以boot启动文件运行。

  4. https://docs.sencha.com/ide_plugins/guides/visual_studio_code_ide_plugin.html
  安装Sencha Ext JS插件，以支持extjs开发；安装好之后打开文件：LicenseManager.js（路径：C:\Users\你的用户名\.vscode\extensions\Sencha.vscode-extjs-版本号\out\src\LicenseManager.js）;把下面代码做如下修改，从const licenses到licenseJson = 上面的}止 这段/* */注释掉 加入：
  						this.license ={
						    active:true,
						    full:true,
						    data:{}
						}
  5. 格式化代码
  Windows：Shift + Alt + F
  Mac： Shift + Option + F
  Ubuntu： Ctrl + Shift + I
