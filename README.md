# ar
Projetode exemplo para automação mobile de Android com appium

# Requisitos 

Java (versão usada 8)

Appium

Node

Android Emulator

Dúvidas de como preparar o seu ambiente você pode ver no Tutorial: [Preparando o ambiente para Appium](https://medium.com/@marina.s.viana/preparando-o-ambiente-para-appium-e663f04af8f2)

**Instalando as ferramentas necessárias**

1- **Android Studio** para baixar o android segue o link: https://developer.android.com/studio/index.html?hl=pt-br

2- **Java JDK 1.8.0_144** ou acima para baixar segue o link: http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

3- Homebrew (sistema de gerenciamento de pacotes para macOS) para instalar o homebrew cole no seu terminal:

/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

4- Node JS 11.1.0 para instalar via linha de comando cole no seu terminal: 

brew install npm

5- **Appium Server 1.9.1** para instalar via linha de comando cole no seu terminal: 

brew install -g appium

6- **Appium-doctor** Verificar se todas as dependências do Appium são atendidas e se todas as dependências estão configuradas corretamente. Para instalar o appium-doctor basta colar no seu terminal: 

npm install -g appium-doctor

**Variaveis de ambiemtes**

Crie o arquivo no terminal cole touch .bash_profile
open ~/.bash_profile   # abre o arquivo bash_profile e cole os arquivos

export ANDROID_HOME=/Users/{SEU_USUÁRIO}/Library/Android/sdk</p>
<p>export PATH+=:$ANDROID_HOME/bin</p>
<p>export PATH+=:$ANDROID_HOME/tools</p>
<p>export PATH+=:$ANDROID_HOME/platform-tools</p>
<p>export PATH+=:$ANDROID_HOME/lib</p>
<p>export PATH+=:$ANDROID_HOME/tools/lib</p>
<p>export PATH="$ANDROID_HOME/emulator:$PATH"</p>
<p>export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home </p>
<p>export PATH=$PATH:$JAVA_HOME </p>
<p>export PATH=$PATH:$JAVA_HOME/bin


**No Android Studio**
1. Abra o Android Studio
2. Na tela inicial clique o item Configure e depois no item SDK Manager
3. Você precisa instalar e/ou atualizar os seguintes itens em cada aba
   1. SDK Platform (aba)
       1. Android 8.1 (Oreo)
   2. SDK Tools (aba)
       1. Android SDK Build-Tools
       2. Android Emulator 27.3.9 (ou superior)
       3. Android SDK Platform-Tools 28.0.0 (ou superior)
       4. Android SDK Tools 26.1.1 (ou superior)
       5. Se existir, marque também o item Intel x86 Emulator Accelerator (HAXM installer)
   3. Clique no botão Apply para atualizar o Android SDK
   4. Ao término da atualização, feche o Android Studio


# Run

1- Levante o appium server. No terminal execute o comando:

appium

2- crie e execute um emulado do android:
 * Abra o Android studio e crie um novo projeto.
     * Escolha a opção Start a new Android Studio project. 
     *Pressione em Next até chegar em Finish. 
 * Na barra de ferramenta vc deve clicar no botão AVD Manager, se este botão não estiver sendo exibido ai vá no menu Tools e escolha a opção AVD Manager.
 * Na janela aberta selecione a opção Create Virtual Devaice. 
 * Na tela a seguir escolha um Device exemplo: Nexus 5x e pressione Next. 
 * Em seguida escolha um sistema operacional (se necessário clique em download) e prossiga até chegar em Finish.
 * Quando o Emulador for criado ele irá ficar disponível para ser iniciado.
 * Em Actions clique em Play para iniciar o emulador.


## Linha de comando

1- Utilizando o teminal execute o comando 

./gradlew runFeatures 

2- Em seguida se desejar ver o relatório execute o comando

allure serve

## Pela IDE
Clicar com o botão direto na classe CucumberTestRunner e escolhe a opção Run ‘CucumberTestRunner’

