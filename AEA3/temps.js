// API gratuïta d'Open-Meteo
const API_URL = 'https://api.open-meteo.com/v1/forecast';
 
const BARCELONA = {
  lat: 41.3874,
  lon: 2.1686,
};
 
// Funció per obtenir les dades del temps
async function obtenirTemps() {
  const tempsDiv = document.getElementById('temps');
 
  try {
    // Mostrem missatge de càrrega
    tempsDiv.innerHTML = '<p>Carregant dades...</p>';
 
    // Construïm la URL amb paràmetres
    const url =
      `${API_URL}?` +
      `latitude=${BARCELONA.lat}&` +
      `longitude=${BARCELONA.lon}&` +
      `current_weather=true&` +
      `timezone=Europe/Madrid`;
 
    // Fem la petició
    const response = await fetch(url);
 
    // Comprovem si hi ha hagut error
    if (!response.ok) {
      throw new Error(`Error HTTP: ${response.status}`);
    }
 
    // Convertim a JSON
    const data = await response.json();
 
    // Validació bàsica
    if (!data.current_weather) {
      throw new Error("No s'han rebut dades de 'current_weather'.");
    }
 
    // Mostrem les dades
    mostrarTemps(data.current_weather);
 
  } catch (error) {
    // Mostrem l'error a l'usuari
    tempsDiv.innerHTML = `
      <p style="color: red;">
        Error: ${error.message}
      </p>
    `;
    console.error('Error complet:', error);
  }
}
 
// Funció per mostrar les dades a la pàgina
function mostrarTemps(temps) {
  const div = document.getElementById('temps');
 
  // Determinem la descripció del temps
  const descripcio = obtenirDescripcio(temps.weathercode);
 
  div.innerHTML = `
    <h2>Condicions actuals:</h2>
    <p><strong>Temps:</strong> ${descripcio}</p>
    <p><strong>Temperatura:</strong> ${temps.temperature}°C</p>
    <p><strong>Velocitat del vent:</strong> ${temps.windspeed} km/h</p>
    <p><strong>Direcció del vent:</strong> ${temps.winddirection}°</p>
    <p><strong>Última actualització:</strong> ${new Date(temps.time).toLocaleString('ca-ES')}</p>
  `;
}
 
// Funció per interpretar el codi del temps
function obtenirDescripcio(code) {
  const descripcions = {
    0: 'Cel clar',
    1: 'Majoritàriament clar',
    2: 'Parcialment ennuvolat',
    3: 'Ennuvolat',
    45: 'Boira',
    48: 'Boira amb gelada',
    51: 'Plugim lleuger',
    53: 'Plugim moderat',
    55: 'Plugim intens',
    61: 'Pluja lleugera',
    63: 'Pluja moderada',
    65: 'Pluja intensa',
    71: 'Neu lleugera',
    73: 'Neu moderada',
    75: 'Neu intensa',
    95: 'Tempesta',
  };
 
  return descripcions[code] || 'Desconegut';
}
 
// Event listener pel botó d'actualització
document
  .getElementById('btnActualitzar')
  .addEventListener('click', obtenirTemps);
 
// Carreguem les dades quan es carrega la pàgina
obtenirTemps();
