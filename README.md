# Joke Generator App 😂

Una aplicación Android que genera chistes aleatorios usando una API externa.

## Características

✅ Chistes aleatorios en inglés  
✅ Interfaz moderna con Jetpack Compose  
✅ Material Design 3  
✅ Conexión a API externa  
✅ CI/CD automático con GitHub Actions  

## Instalación

### 1. Descargar el APK desde GitHub

1. Ve a tu repositorio
2. Toca **Actions**
3. Selecciona el último workflow con ✅
4. Baja hasta **Artifacts**
5. Descarga `app-debug.apk`

### 2. Instalar en tu Samsung A54 5G

1. Abre el administrador de archivos
2. Ve a **Descargas**
3. Toca el archivo `.apk`
4. Toca **Instalar**
5. ¡Listo!

## Requisitos

- Android 6.0 (API 24) o superior
- Conexión a Internet

## Cómo usar

1. Abre la app
2. Toca el botón **Get Joke**
3. Espera a que cargue
4. ¡Disfruta el chiste! 😄

## Estructura del proyecto
joke-generator-app/ ├── app/ │ ├── src/main/ │ │ ├── java/com/example/jokegenerator/ │ │ │ ├── MainActivity.kt │ │ │ ├── Joke.kt │ │ │ └── JokeService.kt │ │ ├── res/ │ │ │ └── values/ │ │ │ ├── strings.xml │ │ │ └── themes.xml │ │ └── AndroidManifest.xml │ └── build.gradle.kts ├── .github/workflows/ │ └── android-build.yml ├── build.gradle.kts ├── settings.gradle.kts └── README.md


## API

Usa [Official Joke API](https://official-joke-api.appspot.com/)

## Licencia

MIT
