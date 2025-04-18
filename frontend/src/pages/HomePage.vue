<template>
  <div class="full-width">
    <div ref="startSection" class="hero-container">
      <div class="hero-section">
        <q-img
          src="~assets/bg3.jpg"
          alt="background image"
          class="hero-image"
        />
        <div class="q-ma-sm fixed">
          <q-btn
            @click="toggleLeftDrawer"
            :size="$q.screen.lt.md ? 'lg' : 'xl'"
            flat
            round
            icon="menu"
            aria-label="Menu"
          />
        </div>
        <q-drawer v-model="leftDrawerOpen" :width="200">
          <div class="q-pa-lg">
            <q-btn @click="scrollToStart" flat no-caps>
              <span class="text-bold"> Αρχική </span>
            </q-btn>
          </div>
          <div class="q-pa-lg">
            <q-btn @click="scrollToSaveTheDate" flat no-caps>
              <span class="text-bold"> Save the date </span>
            </q-btn>
          </div>
          <div @click="scrollToInvitation" class="q-pa-lg">
            <q-btn flat no-caps>
              <span class="text-bold"> Πρόσκληση </span>
            </q-btn>
          </div>
          <div @click="scrollToCountdown" class="q-pa-lg">
            <q-btn flat no-caps>
              <span class="text-bold"> Countdown </span>
            </q-btn>
          </div>
          <div @click="scrollToMap" class="q-pa-lg">
            <q-btn flat no-caps>
              <span class="text-bold"> Χάρτης </span>
            </q-btn>
          </div>
          <div @click="scrollToRsvp" class="q-pa-lg">
            <q-btn flat no-caps>
              <span class="tex-bold"> RSVP </span>
            </q-btn>
          </div>
        </q-drawer>
        <div
          class="hero-content absolute-center text-center"
          :style="{
            transform: `translate(-50%, calc(-50% + ${nameOffset}px)) scale(${nameScale})`,
            opacity: nameOpacity,
          }"
        >
          <div v-if="$q.screen.lt.sm" class="dancing-script">
            Μαρίζα Δημήτρης
          </div>
          <div v-else class="dancing-script">Μαρίζα & Δημήτρης</div>
        </div>
        <div class="arrow-down" :style="{ opacity: arrowOpacity }">
          <q-icon name="keyboard_arrow_down" size="xl" />
        </div>
      </div>
    </div>

    <!-- Sections -->
    <div class="content-wrapper">
      <!-- 1st Section -->
      <section
        ref="saveTheDateSection"
        style="background: #e8e8e8; min-height: 100vh"
        class="content-section text-center flex flex-center column"
      >
        <div
          :class="[$q.screen.lt.md ? 'text-h2' : 'text-h1', 'text-bold']"
          style="color: #690124"
        >
          save the date
        </div>
        <q-separator
          class="custom-separator q-my-md"
          style="background: #690124; width: 200px"
        ></q-separator>
        <div
          :class="[$q.screen.lt.md ? 'text-h4' : 'text-h3', 'q-mt-xl']"
          style="color: #690124"
        >
          20.12.2025
        </div>
      </section>

      <!-- 2nd Section -->
      <section ref="invitationSection" class="wedding-section q-mt-lg">
        <!-- Animation 2nd section -->
        <div class="folder-container">
          <svg class="progress-ring" viewBox="0 0 120 120">
            <circle
              class="progress-ring-circle"
              stroke="#690124"
              stroke-width="3"
              cx="60"
              cy="60"
              r="45"
            />
          </svg>
          <div class="folder-pieces">
            <div class="folder-piece piece1"></div>
            <div class="folder-piece piece2"></div>
            <div class="folder-piece piece3"></div>
          </div>
        </div>

        <!-- Body 2nd section -->
        <q-card
          class="wedding-card shadow-10"
          :style="$q.screen.lt.sm ? 'min-width: 75%' : 'min-width: '"
        >
          <q-card-section>
            <div class="text-font">
              Με μεγάλη μας χαρά σας προσκαλούμε στο γάμο μας!
            </div>
          </q-card-section>
          <q-separator class="custom-separator-second"></q-separator>
          <q-card-section>
            <div v-if="$q.screen.lt.sm" class="text-font">
              Δημήτριος Τσικάκης <br />
              Μαρίζα Κονίδη
            </div>
            <div v-else class="text-font">
              Δημήτριος Τσικάκης & Μαρίζα Κονίδη
            </div>
            <!-- <div class="text-font">Δημήτριος Τσικάκης & Μαρίζα Κονίδη</div> -->
          </q-card-section>
        </q-card>
        <div v-if="$q.screen.lt.sm" class="text-font">
          Οι <span class="text-bold">κουμπάροι</span> μας <br />
          Δημήτριος Διαμαντάρας <br />
          Ιωάννης Πετσάνης
        </div>
        <div v-else class="text-font">
          Οι <span class="text-bold">κουμπάροι</span> μας <br />
          Δημήτριος Διαμαντάρας & Ιωάννης Πετσάνης
        </div>
        <!-- <div class="text-font q-ma-xl">
          Οι <span class="text-bold">γονείς</span> μας <br />
          Τσικάκης Αθανάσιος - Βασιλική Δαρόγλου <br />
          Κονίδης Θεμιστοκλής - Κωνσταντάτου Χριστίνα
        </div> -->
        <div v-if="$q.screen.lt.sm" class="text-font q-ma-xl">
          Οι <span class="text-bold">γονείς</span> μας <br />
          Τσικάκης Αθανάσιος <br />
          Βασιλική Δαρόγλου <br />
          Κονίδης Θεμιστοκλής <br />
          Κωνσταντάτου Χριστίνα
        </div>
        <div v-else class="text-font q-ma-xl">
          Οι <span class="text-bold">γονείς</span> μας <br />
          Τσικάκης Αθανάσιος & Βασιλική Δαρόγλου <br />
          Κονίδης Θεμιστοκλής & Κωνσταντάτου Χριστίνα
        </div>
      </section>

      <!-- 3d Section -->
      <section
        ref="countdownSection"
        style="background: #e8e8e8; min-height: 100vh"
        class="content-section text-center flex flex-center column"
      >
        <!-- Animation 3d section -->
        <div class="clock-container q-mb-xl">
          <div class="clock">
            <div class="hour-hand"></div>
            <div class="minute-hand"></div>
            <div class="second-hand"></div>
            <div class="center-circle"></div>
          </div>
        </div>

        <!-- Body 3rd section -->
        <div :class="[$q.screen.lt.md ? 'text-h4' : 'text-h4', 'text-bold']">
          Ραντεβού σε...
        </div>
        <div
          :class="[
            $q.screen.gt.sm ? 'q-gutter-xl' : 'q-gutter-none',
            'row',
            'q-mt-xl',
          ]"
        >
          <div class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12">
            <div
              :class="[$q.screen.lt.md ? 'text-h3' : 'text-h1', 'text-bold']"
              style="color: #690124"
            >
              {{ days }}
            </div>
            <div class="text-subtitle1">ΗΜΕΡΕΣ</div>
          </div>
          <div class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12">
            <div
              :class="[$q.screen.lt.md ? 'text-h3' : 'text-h1', 'text-bold']"
              style="color: #690124"
            >
              {{ hours }}
            </div>
            <div class="text-subtitle1">ΩΡΕΣ</div>
          </div>
          <div class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12">
            <div
              :class="[$q.screen.lt.md ? 'text-h3' : 'text-h1', 'text-bold']"
              style="color: #690124"
            >
              {{ minutes }}
            </div>
            <div class="text-subtitle1">ΛΕΠΤΑ</div>
          </div>
          <div class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12">
            <div
              :class="[$q.screen.lt.md ? 'text-h3' : 'text-h1', 'text-bold']"
              style="color: #690124"
            >
              {{ seconds }}
            </div>
            <div class="text-subtitle1">ΔΕΥΤΕΡΟΛΕΠΤΑ</div>
          </div>
        </div>
      </section>

      <!-- 4th Section -->
      <section ref="mapSection" class="wedding-section q-mt-lg">
        <!-- Animation 4th section -->
        <div class="location-marker-container">
          <svg
            class="location-pin"
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 384 512"
          >
            <path
              fill="#690124"
              d="M215.7 499.2C267 435 384 279.4 384 192C384 86 298 0 192 0S0 86 0 192c0 87.4 117 243 168.3 307.2c12.3 15.3 35.1 15.3 47.4 0zM192 256c-35.3 0-64-28.7-64-64s28.7-64 64-64s64 28.7 64 64s-28.7 64-64 64z"
            />
          </svg>
        </div>

        <!-- Body 4th section -->
        <div
          :class="[$q.screen.lt.md ? 'text-h4' : 'text-h2', 'text-bold']"
          style="color: #690124"
        >
          Η τοποθεσία μας
        </div>
        <div class="q-ma-lg text-font">
          Σας περιμένουμε στις 18:00 στο κτήμα Οινότρια Γη του Κώστα Λαζαρίδη,
          στο Καπανδρίτι Αττικής. <br />
          Η τελετή θα πραγματοποιηθεί στην αίθουσα Μέθεξη του Μουσείου Οίνου
          <br />
          και στη συνέχεια θα ακολουθήσει πάρτι στην αίθουσα Αλκυονίδες.
        </div>
        <div
          class="map-container q-mt-lg q-mb-xl"
          :class="[$q.screen.lt.md ? 'col' : 'row']"
        >
          <div class="col-xl-8 col-lg-8 col-md-8 col-sm-12 col-xs-12">
            <l-map
              ref="map"
              style="height: 400px"
              :zoom="2"
              :center="markerLatLng"
              :options="{
                attributionControl: false,
                scrollWheelZoom: false,
                dragging: false,
              }"
              @ready="onMapReady"
            >
              <l-tile-layer
                :url="url"
                :attribution="attribution"
              ></l-tile-layer>
              <l-marker :lat-lng="markerLatLng" :icon="redIcon"></l-marker>
            </l-map>
          </div>
          <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12 col-xs-12">
            <q-card class="column" style="height: 100%">
              <q-img src="~assets/card_bg.jpg" style="height: 50%"></q-img>
              <q-item
                @click="redirectToGoogleMaps"
                class="col"
                clickable
                style="background-color: #690124"
              >
                <q-item-section avatar>
                  <q-icon color="white" size="xl" name="mdi-directions" />
                </q-item-section>
                <q-item-section>
                  <div class="text-white text-bold">Οδηγίες</div>
                  <div class="text-white">Οινότρια Γη</div>
                  <div class="text-white">Κτήμα Λαζαρίδη</div>
                  <div class="text-white">Καπανδρίτι</div>
                </q-item-section>
              </q-item>
            </q-card>
          </div>
        </div>
      </section>

      <!-- 5th Section -->
      <section
        ref="rsvpSection"
        style="background: #e8e8e8; min-height: 100vh"
        class="content-section text-center flex flex-center column"
      >
        <!-- Animation -->
        <div class="checkmark-container q-mb-lg">
          <svg
            class="checkmark"
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 52 52"
          >
            <circle
              class="checkmark__circle"
              cx="26"
              cy="26"
              r="25"
              fill="none"
            />
            <path
              class="checkmark__check"
              fill="none"
              d="M14.1 27.2l7.1 7.2 16.7-16.8"
            />
          </svg>
        </div>

        <!-- Body 5th section -->
        <div
          class="q-mt-lg"
          :class="[$q.screen.lt.md ? 'text-h2' : 'text-h1', 'text-bold']"
          style="color: #690124"
        >
          RSVP
        </div>
        <div class="text-font q-mt-lg">
          Παρακαλούμε ενημερώστε μας για την παρουσία σας μέχρι τις
          <span class="text-bold">20.11.2025</span>.
          <br />
          Θα χαρούμε να σας δούμε όλους!
        </div>
        <div class="q-pt-xl">
          <q-btn
            @click="attendDialog = true"
            no-caps
            rounded
            :size="$q.screen.lt.md ? 'md' : 'xl'"
            flat
            class="text-white"
            style="background-color: #690124"
          >
            Κάνε click εδώ
          </q-btn>
        </div>
      </section>

      <!-- Dialog -->
      <q-dialog v-model="attendDialog" persistent="">
        <q-card
          class="q-py-xs q-px-md q-py-sm--up q-px-lg--up"
          style="width: 100%; border-radius: 12px"
        >
          <q-card-section class="text-center">
            <div class="text-h6">RSVP</div>
          </q-card-section>
          <q-separator class="bg-black"></q-separator>
          <q-card-section>
            <q-form>
              <q-input
                v-model.trim="name"
                @update:model-value="
                  (val) => (name = capitalizeName(val.trim()))
                "
                filled
                placeholder="Όνομα και Επίθετο*"
                :rules="[
                  (val) =>
                    (val && val.length > 4) ||
                    'Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο',
                ]"
                lazy-rules
                :input-class="$q.screen.lt.sm ? 'text-caption' : ''"
              />
              <q-input
                v-model="phoneNumber"
                :class="$q.screen.lt.sm ? 'q-mt-md' : 'q-mt-sm'"
                filled
                placeholder="Τηλέφωνο επικοινωνίας*"
                mask="##########"
                :rules="[
                  (val) =>
                    (val && val.length > 9) ||
                    'Παρακαλώ καταχωρήστε σωστό αριθμό',
                ]"
                lazy-rules
                :input-class="$q.screen.lt.sm ? 'text-caption' : ''"
              />
              <q-input
                v-model.trim="mail"
                :class="$q.screen.lt.sm ? 'q-mt-md' : 'q-mt-sm'"
                filled
                placeholder="Email"
                :input-class="$q.screen.lt.sm ? 'text-caption' : ''"
              />
              <q-select
                :disable="
                  !(name && name.length > 4) ||
                  !(phoneNumber && phoneNumber.length > 9)
                "
                v-model="selectedOption"
                :options="eventOptions"
                class="q-mt-lg"
                label="Ενημερώστε μας για την παρουσία σας*"
                transition-show="flip-up"
                transition-hide="flip-down"
                filled
              />
              <q-input
                v-if="selectedOption.value === 'yes'"
                v-model.trim="plusOneName"
                @update:model-value="
                  (val) => (plusOneName = capitalizeName(val.trim()))
                "
                class="q-mt-lg"
                filled
                placeholder="Όνομα & Επίθετο συνοδού"
                :rules="[
                  (val) =>
                    (val && val.length > 4) ||
                    'Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο',
                ]"
                lazy-rules="ondemand"
                :input-class="$q.screen.lt.sm ? 'text-caption' : ''"
              />
              <q-input
                v-if="selectedOption.value === 'yes'"
                v-model.trim="otherPerson"
                @update:model-value="
                  (val) => (otherPerson = capitalizeName(val.trim()))
                "
                filled
                class="q-mt-sm"
                placeholder="Παιδιά"
                @keyup.enter="addChip"
                bottom-slots
                :input-class="$q.screen.lt.sm ? 'text-caption' : ''"
              >
                <template v-slot:hint>
                  <div>
                    Πατήστε το
                    <span class="text-bold text-black">enter</span> μόλις
                    γράψετε ένα όνομα
                  </div>
                </template>
              </q-input>
              <div
                v-if="otherPeople.length && selectedOption.value === 'yes'"
                class="q-mt-md"
              >
                <q-chip
                  v-for="(other, index) in otherPeople"
                  :key="index"
                  removable
                  :color="getRandomColor(index)"
                  @remove="removeChip(index)"
                  class="q-mb-xs"
                >
                  {{ other }}
                </q-chip>
              </div>
            </q-form>
          </q-card-section>
          <q-card-actions align="center">
            <q-btn
              @click="cancelAttend"
              class="bg-grey text-white text-bold"
              no-caps
              :size="$q.screen.lt.sm ? 'sm' : 'md'"
            >
              Ακύρωση
            </q-btn>
            <q-btn
              :disable="!canSubmit"
              @click="submitAttend"
              style="background-color: #690124"
              class="text-white text-bold"
              no-caps
              :size="$q.screen.lt.sm ? 'sm' : 'md'"
            >
              Καταχώρηση
            </q-btn>
          </q-card-actions>
        </q-card>
      </q-dialog>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted, nextTick, computed } from "vue";
import { LMap, LTileLayer, LMarker } from "@vue-leaflet/vue-leaflet";
import L from "leaflet";
import "leaflet/dist/leaflet.css";
import { useQuasar } from "quasar";
import { axios } from "boot/axios";

// Data
name: "HomePage";
const $q = useQuasar();
const days = ref(0);
const hours = ref(0);
const minutes = ref(0);
const seconds = ref(0);
const nameOffset = ref(0);
const nameScale = ref(1);
const nameOpacity = ref(1);
const scrollPosition = ref(0);
const arrowOpacity = ref(1);
const leftDrawerOpen = ref(false);
const saveTheDateSection = ref(null);
const startSection = ref(null);
const invitationSection = ref(null);
const countdownSection = ref(null);
const map = ref(null);
const url = "https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png";
const attribution =
  '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors';
const markerLatLng = ref([38.2313822, 23.8709736]);
const redIcon = ref(null);
const mapSection = ref(null);
const attendDialog = ref(false);
const rsvpSection = ref(null);
const name = ref("");
const phoneNumber = ref(null);
const mail = ref("");
const selectedOption = ref("");
const eventOptions = ref([
  { label: "Ναι, θα παρευρεθώ σίγουρα!", value: "yes" },
  { label: "Δυστυχώς δεν θα παρευρεθώ", value: "no" },
]);
const plusOneName = ref("");
const otherPerson = ref("");
const otherPeople = ref([]);
const colors = [
  "secondary",
  "accent",
  "positive",
  "negative",
  "info",
  "warning",
  "indigo",
  "teal",
  "green",
  "red",
  "blue",
  "yellow",
];
const isOtherPersonActive = ref(false);

// Computed
const canSubmit = computed(() => {
  const isNameValid = name.value && name.value.length > 4;

  const isPhoneNumberValid = phoneNumber.value && phoneNumber.value.length > 9;

  const selectedOptionValid = selectedOption.value;

  const isPlusOneValid = !plusOneName.value || plusOneName.value.length > 4;

  const isOtherPersonValid = !otherPerson.value || otherPeople.length > 4;

  return (
    isNameValid &&
    isPlusOneValid &&
    isOtherPersonValid &&
    isPhoneNumberValid &&
    selectedOptionValid
  );
});

// Functions
const redirectToGoogleMaps = () => {
  const [lat, lng] = markerLatLng.value;
  window.open(
    `https://www.google.com/maps/dir/?api=1&destination=${lat},${lng}`,
    "_blank"
  );
};

function onMapReady(map) {
  map.flyTo(markerLatLng.value, 15, {
    duration: 2,
    easeLinearity: 0.25,
  });
}

function toggleLeftDrawer() {
  leftDrawerOpen.value = !leftDrawerOpen.value;
}

function scrollToSaveTheDate() {
  if (!saveTheDateSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    saveTheDateSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function scrollToRsvp() {
  if (!rsvpSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    rsvpSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function scrollToMap() {
  if (!mapSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    mapSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function scrollToStart() {
  if (!startSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    startSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function scrollToInvitation() {
  if (!invitationSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    invitationSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function scrollToCountdown() {
  if (!countdownSection.value) return;

  leftDrawerOpen.value = false;

  nextTick(() => {
    countdownSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  });
}

function updateCountdown() {
  const targetDate = new Date(2025, 11, 20, 18, 0, 0);
  const now = new Date();

  const diff = targetDate - now;

  if (diff <= 0) {
    days.value = 0;
    hours.value = 0;
    minutes.value = 0;
    seconds.value = 0;
    return;
  }

  const daysCalc = Math.floor(diff / (1000 * 60 * 60 * 24));
  const hoursCalc = Math.floor(
    (diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60)
  );
  const minutesCalc = Math.floor((diff % (1000 * 60 * 60)) / (1000 * 60));
  const secondsCalc = Math.floor((diff % (1000 * 60)) / 1000);

  days.value = daysCalc;
  hours.value = hoursCalc;
  minutes.value = minutesCalc;
  seconds.value = secondsCalc;
}

function handleScroll() {
  const scrollY = window.scrollY || window.pageYOffset;
  // Move text in opposite direction (negative value)
  nameOffset.value = -scrollY * 0.8; // Adjust 0.5 to control speed

  // Optional effects
  const scale = 1 - Math.min(scrollY / 1000, 0.3);
  nameScale.value = Math.max(scale, 0.7);

  scrollPosition.value = scrollY;
}

function capitalizeName(fullName) {
  return fullName
    .split(" ")
    .map((name) => name.charAt(0).toUpperCase() + name.slice(1).toLowerCase())
    .join(" ");
}

function addChip() {
  const trimmedValue = otherPerson.value.trim();

  if (!trimmedValue) return;

  if (trimmedValue.length <= 2) {
    $q.notify({
      message:
        "Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο (τουλάχιστον 3 χαρακτήρες)",
      color: "negative",
      position: "bottom",
    });
    return;
  }

  if (otherPeople.value.includes(trimmedValue)) {
    $q.notify({
      message: "Το όνομα αυτό υπάρχει ήδη!",
      color: "warning",
      position: "bottom",
    });
    otherPerson.value = "";
    return;
  }

  otherPeople.value.push(trimmedValue);
  otherPerson.value = "";
  isOtherPersonActive.value = false;
}

function removeChip(index) {
  otherPeople.value.splice(index, 1);
}

function getRandomColor(index) {
  return colors[index % colors.length];
}

function cancelAttend() {
  attendDialog.value = false;
  name.value = "";
  plusOneName.value = "";
  otherPerson.value = "";
  otherPeople.value = [];
  phoneNumber.value = null;
  mail.value = "";
  selectedOption.value = "";
}

async function submitAttend() {
  const payload = {
    name: name.value,
    plusOneName: plusOneName.value,
    phoneNumber: phoneNumber.value,
    mail: mail.value,
    selectedOption: selectedOption.value.value,
    otherPeople: otherPeople.value.map((name) => ({ name })),
  };

  try {
    const response = await axios.post("/api/v1/submit-attend", payload);

    console.log("Success:", response.data);
    $q.notify({
      message: "Καταχωρήθηκε επιτυχώς!!",
      color: "primary",
      position: "bottom",
    });
    attendDialog.value = false;
    name.value = "";
    plusOneName.value = "";
    otherPerson.value = "";
    otherPeople.value = [];
    phoneNumber.value = null;
    mail.value = "";
    selectedOption.value = "";
  } catch (error) {
    console.error("Error:", error.response?.data || error.message);
  }
}

// Lify Cycle Hooks
onMounted(() => {
  redIcon.value = L.icon({
    iconUrl:
      "https://raw.githubusercontent.com/pointhi/leaflet-color-markers/master/img/marker-icon-2x-red.png",
    iconSize: [25, 41],
    iconAnchor: [12, 41],
    popupAnchor: [1, -34],
    shadowUrl:
      "https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.7.1/images/marker-shadow.png",
    shadowSize: [41, 41],
  });

  window.addEventListener("scroll", handleScroll);

  updateCountdown();
  const countdownInterval = setInterval(updateCountdown, 1000);

  onUnmounted(() => {
    clearInterval(countdownInterval);
  });
});

onUnmounted(() => {
  window.removeEventListener("scroll", handleScroll);
});
</script>

<style scoped>
.text-font {
  /* font-family: "Alex Brush", cursive;
  font-style: italic;
  font-size: 3vh; */
  font-family: sans-serif;
  font-size: 18px;
  font-style: italic;
}
.dancing-script {
  font-family: "Alex Brush", cursive;
  font-style: italic;
  font-size: 12vh;
  font-weight: 700;
  color: white;
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
  transition: all 0.8s cubic-bezier(0.16, 1, 0.3, 1);
}

.hero-container {
  height: 250vh;
  position: relative;
}

.hero-section {
  height: 100vh;
  width: 100%;
  position: sticky;
  top: 0;
  overflow: hidden;
  z-index: 9999;
}

.hero-image {
  width: 100%;
  height: 100%;
  object-fit: cover;
  position: absolute;
}

.hero-content {
  width: 80%;
  transition: all 0.8s cubic-bezier(0.16, 1, 0.3, 1);
  position: absolute;
  left: 50%;
  top: 120%;
  transform: translate(-50%, -50%);
}

.arrow-down {
  position: absolute;
  left: 50%;
  bottom: 40px;
  transform: translateX(-50%);
  background: rgba(255, 255, 255, 0.2);
  backdrop-filter: blur(5px);
  border: 1px solid rgb(255, 255, 255);
  border-radius: 50px; /* Pill shape */
  padding: 2px 4px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.5s ease;
  z-index: 2;
  animation: bounce 2s infinite;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.arrow-down .q-icon {
  color: white;
  font-size: 1.8rem;
  text-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
}

@keyframes bounce {
  0%,
  20%,
  50%,
  80%,
  100% {
    transform: translateY(0) translateX(-50%);
  }
  40% {
    transform: translateY(-15px) translateX(-50%);
  }
  60% {
    transform: translateY(-7px) translateX(-50%);
  }
}

.content-wrapper {
  position: relative;
  background: white;
  /* z-index: -1; */
}

.content-section {
  min-height: 100vh;
  padding: 80px 20px;
  position: relative;
}

.custom-separator {
  height: 4px;
  width: 45%;
  margin: 30px auto 0;
  border-radius: 2px;
}

.custom-separator-second {
  background: #000000;
  height: 2px;
  width: 45%;
  margin: 1rem auto;
  border-radius: 2px;
}

/* Main section styling */
.wedding-section {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-align: center;
}

/* Animated folder container */
.folder-container {
  position: relative;
  margin-bottom: -50px;
  z-index: 1;
  width: 120px;
  height: 120px;
}

/* Folder pieces animation */
.folder-pieces {
  position: relative;
  width: 100%;
  height: 100%;
}

.folder-piece {
  position: absolute;
  width: 40px;
  height: 30px;
  background: #f5f5f5;
  border: 2px solid #690124;
  border-radius: 3px;
  transition: all 0.5s ease;
}

/* Position folder pieces */
.piece1 {
  top: 30px;
  left: 40px;
  transform: rotate(0deg);
}
.piece2 {
  top: 40px;
  left: 30px;
  transform: rotate(15deg);
}
.piece3 {
  top: 50px;
  left: 50px;
  transform: rotate(-15deg);
}

.progress-ring {
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
}

.progress-ring-circle {
  fill: transparent;
  stroke: #ffffff;
  stroke-width: 3;
  stroke-dasharray: 283;
  stroke-dashoffset: 283;
  animation: circle-fill 3s linear infinite;
  transform-origin: 50% 50%;
  transform: rotate(-90deg);
}

@keyframes circle-fill {
  0% {
    stroke-dashoffset: 283;
    stroke: #d8b4a0;
  }
  50% {
    stroke: #585858;
  }
  100% {
    stroke-dashoffset: 0;
    stroke: #690124;
  }
}

/* Card styling */
.wedding-card {
  border-radius: 24px;
  background: #e8e8e8;
  position: relative;
  z-index: 0;
  margin: 3.5rem;
  padding: 1.5rem;
}

/* Clock Styles */
.clock-container {
  display: flex;
  justify-content: center;
}

.clock {
  width: 120px;
  height: 120px;
  border: 8px solid #690124;
  border-radius: 50%;
  position: relative;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
}

.hour-hand,
.minute-hand,
.second-hand {
  position: absolute;
  left: 50%;
  bottom: 50%;
  transform-origin: 50% 100%;
  background-color: #690124;
}

.hour-hand {
  width: 6px;
  height: 35px;
  margin-left: -3px;
  animation: rotate-hour 43200s linear infinite;
}

.minute-hand {
  width: 4px;
  height: 50px;
  margin-left: -2px;
  animation: rotate-minute 12s linear infinite;
}

.center-circle {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 12px;
  height: 12px;
  margin-left: -6px;
  margin-top: -6px;
  background-color: #690124;
  border-radius: 50%;
  z-index: 10;
}

@keyframes rotate-hour {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@keyframes rotate-minute {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@keyframes rotate-second {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

/* Location pin container */
.location-marker-container {
  text-align: center;
  margin-bottom: 20px;
}

.location-pin {
  width: 80px;
  height: 80px;
  animation: bounceAndFade 2s infinite;
}

@keyframes bounceAndFade {
  0%,
  100% {
    transform: translateY(0) scale(1);
    opacity: 1;
  }
  25% {
    transform: translateY(-15px) scale(1.1);
    opacity: 0.8;
  }
  50% {
    transform: translateY(0) scale(1);
    opacity: 1;
  }
  75% {
    transform: translateY(-7px) scale(1.05);
    opacity: 0.9;
  }
}

/* Optional: Add a pulsing effect */
.location-pin::after {
  content: "";
  position: absolute;
  width: 60px;
  height: 60px;
  background: rgba(105, 1, 36, 0.2);
  border-radius: 50%;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  animation: pulse 2s infinite;
  z-index: -1;
}

@keyframes pulse {
  0% {
    transform: translate(-50%, -50%) scale(0.5);
    opacity: 0.7;
  }
  100% {
    transform: translate(-50%, -50%) scale(1.5);
    opacity: 0;
  }
}

/* Map container */
.map-container {
  height: 400px; /* Same height you had before */
  width: 50%; /* Ensure it takes full width */
  position: relative;
}

/* RSVP  */
.checkmark-container {
  width: 100px;
  height: 100px;
  margin: 0 auto;
}

.checkmark__circle {
  stroke-dasharray: 166;
  stroke-dashoffset: 166;
  stroke-width: 2;
  stroke-miterlimit: 10;
  stroke: #690124;
  fill: none;
  animation: stroke 0.6s cubic-bezier(0.65, 0, 0.45, 1) forwards;
}

.checkmark {
  width: 100px;
  height: 100px;
  border-radius: 50%;
  display: block;
  stroke-width: 2;
  stroke: #fff;
  stroke-miterlimit: 10;
  box-shadow: inset 0px 0px 0px #690124;
  animation: fill 0.4s ease-in-out 0.4s forwards,
    scale 0.3s ease-in-out 0.9s both, resetAnimation 1s infinite 1s;
}

.checkmark__check {
  transform-origin: 50% 50%;
  stroke-dasharray: 48;
  stroke-dashoffset: 48;
  animation: stroke 0.3s cubic-bezier(0.65, 0, 0.45, 1) 0.8s forwards;
}

@keyframes stroke {
  100% {
    stroke-dashoffset: 0;
  }
}

@keyframes scale {
  0%,
  100% {
    transform: none;
  }
  50% {
    transform: scale3d(1.1, 1.1, 1);
  }
}

@keyframes fill {
  100% {
    box-shadow: inset 0px 0px 0px 50px rgba(105, 1, 36, 0);
  }
}

/* This keyframe resets all properties to trigger animation again */
@keyframes resetAnimation {
  to {
    stroke-dashoffset: 166; /* Reset circle */
    box-shadow: inset 0px 0px 0px #690124; /* Reset fill */
    /* For checkmark, it will reset automatically when parent resets */
  }
}

/* Media */
@media (max-width: 1024px) {
  .dancing-script {
    font-size: 8vh;
  }
  .map-container {
    width: 100%; /* Ensure it takes full width */
    position: relative; /* Important for leaflet maps */
  }
}

@media (min-width: 1920px) {
  .map-container .q-card {
    max-height: 400px !important;
  }
}
</style>
