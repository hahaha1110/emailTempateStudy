File sourceFile = new File("D:/workspace/emailTemplateStudy/groovyImportTest/importGroovy.groovy"); // 불러올파일 경로
Class groovyClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile);
GroovyObject myObject = (GroovyObject) groovyClass.newInstance();

println myObject.codeBook.get("bankCodes").get("000")

