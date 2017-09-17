@echo off
set workspace=C:\Users\Rafael\Desktop\miw\workspace\oxygen\rafael.falconi.SVC.miw.upm.es
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_144
set M2_HOME=C:\Users\Rafael\Desktop\miw\programas\apache-maven-3.5.0
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
echo -----------------------------------------
echo . (C) MIW - UPM
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%

:: -ff, --fail-fast. Stop at first failure in reactorized builds
echo ============ mvn -ff clean test --settings settings.xml (profile: develop) ==================================
echo .
call mvn -ff clean test --settings settings.xml
if errorLevel 1 goto errorDevelop

pause
exit

:errorDevelop
echo .
echo .
echo .
echo >>>>>>>>>>>>>>>>>>>  ERRORES!!!!!!!!!!!!!!
pause
