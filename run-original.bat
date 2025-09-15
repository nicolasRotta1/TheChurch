@echo off
echo ===============================================
echo      COMPILANDO VERSAO ORIGINAL DO JOGO
echo ===============================================
echo.

REM Compila o projeto
javac -d out -sourcepath src src\Main.java

if %ERRORLEVEL% EQU 0 (
    echo Compilacao concluida com sucesso!
    echo.
    echo ===============================================
    echo         INICIANDO O JOGO ORIGINAL...
    echo ===============================================
    echo.
    
    REM Executa o jogo
    java -cp out Main
) else (
    echo Erro na compilacao!
    pause
)
