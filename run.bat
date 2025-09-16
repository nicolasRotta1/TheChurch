@echo off
echo ===============================================
echo       COMPILANDO LENDAS URBANAS - O JOGO
echo ===============================================
echo.

REM Compila o projeto
javac -d out -sourcepath src src\MainGUI.java

if %ERRORLEVEL% EQU 0 (
    echo Compilacao concluida com sucesso!
    echo.
    echo ===============================================
    echo         INICIANDO O JOGO...
    echo ===============================================
    echo.
    
    REM Executa o jogo
    java -cp out MainGUI
) else (
    echo Erro na compilacao!
    pause
)
