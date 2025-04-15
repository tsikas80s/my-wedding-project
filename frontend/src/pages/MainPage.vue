<template>
  <div>
    <!-- 1st card -->
    <div class="row">
      <q-space />
      <div class="col-8" style="max-width: 2560px">
        <q-card class="q-mt-lg" style="border-radius: 12px; opacity: 75%">
          <div class="row">
            <q-card-section
              class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12 text-center"
            >
              <div class="dancing-script">Welcome to our Wedding !!!</div>
            </q-card-section>
            <q-space></q-space>
            <q-card-section
              class="col-xl-auto col-lg-auto col-md-auto col-sm-12 col-xs-12 flex flex-center text-center"
            >
              <div>
                <q-btn
                  :to="{ name: 'AboutPage' }"
                  flat
                  style="color: #690124"
                  class="hover-underline btn--no-hover"
                  no-caps
                >
                  <span class="text-weight-bold">About</span>
                </q-btn>
                <q-btn
                  class="hover-underline btn--no-hover"
                  flat
                  style="color: #690124"
                  no-caps
                  @click="attendDialog = true"
                >
                  <span class="text-weight-bold">Attend</span>
                </q-btn>
                <q-btn
                  @click="scrollToMap"
                  class="hover-underline btn--no-hover"
                  flat
                  style="color: #690124"
                  no-caps
                >
                  <span class="text-weight-bold">See us on map</span>
                </q-btn>
              </div>
            </q-card-section>
          </div>
        </q-card>
      </div>
      <q-space />
    </div>

    <!-- 2nd Card -->
    <div class="row">
      <q-space></q-space>
      <div class="col-8" style="max-width: 2560px">
        <q-card class="q-mt-xl" style="border-radius: 12px; opacity: 55%">
          <q-card-section>
            <div>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis
              voluptatem dolore unde dolores tenetur! Quo molestiae architecto
              dicta voluptatum impedit necessitatibus! Numquam dignissimos ipsa,
              ullam molestiae excepturi, in maiores, aspernatur veniam voluptas
              error voluptates qui! Nisi impedit dolorum mollitia doloribus
              cumque. Animi nesciunt ut vitae nulla magnam quod, repellat
              suscipit at aperiam omnis dicta, dolore sunt id recusandae quae
              culpa voluptas illum ad odio delectus cumque. Perspiciatis eaque
              aliquam, quae pariatur in adipisci! Dolor neque vero quis quasi
              commodi numquam dolorum dolorem tenetur, atque necessitatibus
              tempora alias cupiditate. Sunt quaerat minus quas maiores fugit
              esse deleniti voluptatibus officiis dolorem earum distinctio, illo
              in repellat incidunt praesentium nobis ullam sit qui, eius eum,
              unde illum? Mollitia sed corrupti voluptates consequuntur aperiam
              repellendus assumenda nisi eos ipsum nostrum, nam nihil illum.
              Autem libero, ipsa necessitatibus beatae et sunt! Blanditiis alias
              totam suscipit laboriosam sed molestias quisquam? Voluptatibus ex
              doloribus beatae quaerat aut quam amet! Amet debitis porro omnis
              tempore nostrum autem necessitatibus perspiciatis delectus
              consectetur modi voluptatibus quaerat dolorum quas culpa quisquam,
              ut esse non quam id facilis, minima, nisi est. Sed quisquam, nihil
              pariatur molestias recusandae architecto fugiat perferendis quae
              dolorem assumenda ullam aliquam quibusdam minima, odit dignissimos
              vitae est iusto.
            </div>
            <div class="q-mt-lg">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis
              voluptatem dolore unde dolores tenetur! Quo molestiae architecto
              dicta voluptatum impedit necessitatibus! Numquam dignissimos ipsa,
              ullam molestiae excepturi, in maiores, aspernatur veniam voluptas
              error voluptates qui! Nisi impedit dolorum mollitia doloribus
              cumque. Animi nesciunt ut vitae nulla magnam quod, repellat
              suscipit at aperiam omnis dicta, dolore sunt id recusandae quae
              culpa voluptas illum ad odio delectus cumque. Perspiciatis eaque
              aliquam, quae pariatur in adipisci! Dolor neque vero quis quasi
              commodi numquam dolorum dolorem tenetur, atque necessitatibus
              tempora alias cupiditate. Sunt quaerat minus quas maiores fugit
              esse deleniti voluptatibus officiis dolorem earum distinctio, illo
              in repellat incidunt praesentium nobis ullam sit qui, eius eum,
              unde illum? Mollitia sed corrupti voluptates consequuntur aperiam
              repellendus assumenda nisi eos ipsum nostrum, nam nihil illum.
              Autem libero, ipsa necessitatibus beatae et sunt! Blanditiis alias
              totam suscipit laboriosam sed molestias quisquam? Voluptatibus ex
              doloribus beatae quaerat aut quam amet! Amet debitis porro omnis
              tempore nostrum autem necessitatibus perspiciatis delectus
              consectetur modi voluptatibus quaerat dolorum quas culpa quisquam,
              ut esse non quam id facilis, minima, nisi est. Sed quisquam, nihil
              pariatur molestias recusandae architecto fugiat perferendis quae
              dolorem assumenda ullam aliquam quibusdam minima, odit dignissimos
              vitae est iusto.
            </div>
          </q-card-section>
        </q-card>
      </div>
      <q-space></q-space>
    </div>

    <!-- 3rd Card -->
    <div class="row">
      <q-space></q-space>
      <div class="col-8" style="max-width: 2560px">
        <q-card class="q-mt-xl" style="border-radius: 12px; opacity: 55%">
          <q-card-section>
            <div>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis
              voluptatem dolore unde dolores tenetur! Quo molestiae architecto
              dicta voluptatum impedit necessitatibus! Numquam dignissimos ipsa,
              ullam molestiae excepturi, in maiores, aspernatur veniam voluptas
              error voluptates qui! Nisi impedit dolorum mollitia doloribus
              cumque. Animi nesciunt ut vitae nulla magnam quod, repellat
              suscipit at aperiam omnis dicta, dolore sunt id recusandae quae
              culpa voluptas illum ad odio delectus cumque. Perspiciatis eaque
              aliquam, quae pariatur in adipisci! Dolor neque vero quis quasi
              commodi numquam dolorum dolorem tenetur, atque necessitatibus
              tempora alias cupiditate. Sunt quaerat minus quas maiores fugit
              esse deleniti voluptatibus officiis dolorem earum distinctio, illo
              in repellat incidunt praesentium nobis ullam sit qui, eius eum,
              unde illum? Mollitia sed corrupti voluptates consequuntur aperiam
              repellendus assumenda nisi eos ipsum nostrum, nam nihil illum.
              Autem libero, ipsa necessitatibus beatae et sunt! Blanditiis alias
              totam suscipit laboriosam sed molestias quisquam? Voluptatibus ex
              doloribus beatae quaerat aut quam amet! Amet debitis porro omnis
              tempore nostrum autem necessitatibus perspiciatis delectus
              consectetur modi voluptatibus quaerat dolorum quas culpa quisquam,
              ut esse non quam id facilis, minima, nisi est. Sed quisquam, nihil
              pariatur molestias recusandae architecto fugiat perferendis quae
              dolorem assumenda ullam aliquam quibusdam minima, odit dignissimos
              vitae est iusto.
            </div>
            <div class="q-mt-lg">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis
              voluptatem dolore unde dolores tenetur! Quo molestiae architecto
              dicta voluptatum impedit necessitatibus! Numquam dignissimos ipsa,
              ullam molestiae excepturi, in maiores, aspernatur veniam voluptas
              error voluptates qui! Nisi impedit dolorum mollitia doloribus
              cumque. Animi nesciunt ut vitae nulla magnam quod, repellat
              suscipit at aperiam omnis dicta, dolore sunt id recusandae quae
              culpa voluptas illum ad odio delectus cumque. Perspiciatis eaque
              aliquam, quae pariatur in adipisci! Dolor neque vero quis quasi
              commodi numquam dolorum dolorem tenetur, atque necessitatibus
              tempora alias cupiditate. Sunt quaerat minus quas maiores fugit
              esse deleniti voluptatibus officiis dolorem earum distinctio, illo
              in repellat incidunt praesentium nobis ullam sit qui, eius eum,
              unde illum? Mollitia sed corrupti voluptates consequuntur aperiam
              repellendus assumenda nisi eos ipsum nostrum, nam nihil illum.
              Autem libero, ipsa necessitatibus beatae et sunt! Blanditiis alias
              totam suscipit laboriosam sed molestias quisquam? Voluptatibus ex
              doloribus beatae quaerat aut quam amet! Amet debitis porro omnis
              tempore nostrum autem necessitatibus perspiciatis delectus
              consectetur modi voluptatibus quaerat dolorum quas culpa quisquam,
              ut esse non quam id facilis, minima, nisi est. Sed quisquam, nihil
              pariatur molestias recusandae architecto fugiat perferendis quae
              dolorem assumenda ullam aliquam quibusdam minima, odit dignissimos
              vitae est iusto.
            </div>
          </q-card-section>
        </q-card>
      </div>
      <q-space></q-space>
    </div>

    <!-- 4th Card -->
    <div class="row">
      <q-space></q-space>
      <div
        class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-xs-8"
        ref="mapSection"
        style="max-width: 2560px"
      >
        <q-card class="q-mt-xl q-mb-xl map-card" style="border-radius: 12px">
          <q-card-section>
            <div>
              <l-map
                ref="map"
                style="height: 400px"
                :zoom="2"
                :center="markerLatLng"
                :options="{ attributionControl: false, scrollWheelZoom: false }"
                @ready="onMapReady"
              >
                <l-tile-layer
                  :url="url"
                  :attribution="attribution"
                ></l-tile-layer>
                <l-marker :lat-lng="markerLatLng" :icon="redIcon"></l-marker>
              </l-map>
            </div>
          </q-card-section>
        </q-card>
      </div>
      <q-space></q-space>
    </div>

    <!-- Attend Dialog -->
    <q-dialog v-model="attendDialog" persistent="">
      <q-card
        class="q-py-xs q-px-md q-py-sm--up q-px-lg--up"
        style="min-width: 50vw; max-width: 80vw; border-radius: 12px"
      >
        <q-card-section class="text-center">
          <div class="text-h6">Attend Form</div>
        </q-card-section>
        <q-separator class="bg-black"></q-separator>
        <q-card-section>
          <div class="text-center">
            <p class="text-italic">
              Ενημέρωσε μας αν πρόκειται να έρθεις εσύ και το one plus σου.
            </p>
          </div>
        </q-card-section>
        <q-card-section>
          <q-form>
            <q-input
              :model-value.trim="name"
              @update:model-value="(val) => (name = capitalizeName(val.trim()))"
              filled
              @keydown="
                (e) =>
                  !/[A-Za-z\u0370-\u03FF\u1F00-\u1FFF ]/.test(e.key) &&
                  e.preventDefault()
              "
              label="Όνομα και Επίθετο*"
              :rules="[
                (val) =>
                  (val && val.length > 4) ||
                  'Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο',
              ]"
            >
            </q-input>
            <q-input
              :disable="!name"
              :model-value="plusOneName"
              @keydown="
                (e) =>
                  !/[A-Za-z\u0370-\u03FF\u1F00-\u1FFF ]/.test(e.key) &&
                  e.preventDefault()
              "
              @update:model-value="
                (val) => (plusOneName = capitalizeName(val.trim()))
              "
              class="q-mt-lg"
              filled
              label="Όνομα και Επίθετο του plus one"
              :rules="[
                (val) =>
                  (val && val.length > 4) ||
                  'Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο',
              ]"
            >
            </q-input>
            <q-input
              :disable="!name"
              :model-value="otherPerson"
              @keydown="
                (e) =>
                  !/[A-Za-z\u0370-\u03FF\u1F00-\u1FFF ]/.test(e.key) &&
                  e.preventDefault()
              "
              @update:model-value="
                (val) => {
                  otherPerson = capitalizeName(val.trim());
                  isOtherPersonActive = !!val.trim();
                }
              "
              class="q-mt-lg bold-enter-hint"
              filled
              label="Επιπλέον άτομα"
              @keyup.enter="addChip"
              bottom-slots
              :rules="
                isOtherPersonActive
                  ? [
                      (val) =>
                        (val && val.length > 4) ||
                        'Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο',
                    ]
                  : null
              "
            >
              <template v-slot:hint>
                <div>
                  Πατήστε το
                  <span class="text-bold text-black">enter</span> μόλις γράψετε
                  ένα όνομα
                </div>
              </template>
            </q-input>
            <div v-if="otherPeople.length">
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
          <q-btn @click="cancelAttend" class="bg-grey-10 text-white" no-caps>
            Cancel
          </q-btn>
          <q-btn
            :disable="!canSubmit"
            @click="submitAttend"
            style="background-color: #690124"
            class="text-white"
            no-caps
          >
            Submit
          </q-btn>
        </q-card-actions>
      </q-card>
    </q-dialog>
  </div>
</template>

<script setup>
import { LMap, LTileLayer, LMarker } from "@vue-leaflet/vue-leaflet";
import "leaflet/dist/leaflet.css";
import { ref, onMounted, computed } from "vue";
import L from "leaflet";
import { axios } from "boot/axios";
import { useQuasar } from "quasar";

//Data
name: "HomePage";
const $q = useQuasar();
const map = ref(null);
const url = "https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png";
const attribution =
  '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors';
const markerLatLng = ref([38.23103, 23.87024]);
const redIcon = ref(null);
const mapSection = ref(null);
const attendDialog = ref(false);
const name = ref("");
const plusOneName = ref("");
const otherPerson = ref("");
const otherPeople = ref([]);
const colors = [
  "primary",
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

//Lifecycle Hooks
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
});

// Computed
const canSubmit = computed(() => {
  const isNameValid = name.value && name.value.length > 4;

  const isPlusOneValid = !plusOneName.value || plusOneName.value.length > 4;

  const isOtherPersonValid = !otherPerson.value || otherPeople.length > 4;

  return isNameValid && isPlusOneValid && isOtherPersonValid;
});

//Methods
function capitalizeName(fullName) {
  return fullName
    .split(" ")
    .map((name) => name.charAt(0).toUpperCase() + name.slice(1).toLowerCase())
    .join(" ");
}

function onMapReady(map) {
  map.flyTo(markerLatLng.value, 15, {
    duration: 2,
    easeLinearity: 0.25,
  });
}

function scrollToMap() {
  if (mapSection.value) {
    mapSection.value.scrollIntoView({
      behavior: "smooth",
      block: "start",
    });
  }
}

function cancelAttend() {
  attendDialog.value = false;
  name.value = "";
  plusOneName.value = "";
  otherPerson.value = "";
  otherPeople.value = [];
}

async function submitAttend() {
  const payload = {
    name: name.value,
    plusOneName: plusOneName.value,
    otherPeople: otherPeople.value.map((name) => ({ name })),
  };

  try {
    const response = await axios.post("/api/v1/submit-attend", payload);

    console.log("Success:", response.data);
    attendDialog.value = false;
    name.value = "";
    plusOneName.value = "";
    otherPeople.value = [];
  } catch (error) {
    console.error("Error:", error.response?.data || error.message);
  }
}

function addChip() {
  const trimmedValue = otherPerson.value.trim();

  if (!trimmedValue) return;

  if (trimmedValue.length <= 4) {
    $q.notify({
      message:
        "Παρακαλώ καταχωρήστε σωστό όνομα και επίθετο (τουλάχιστον 5 χαρακτήρες)",
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
</script>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Great+Vibes&family=Dancing+Script&display=swap");

.dancing-script {
  font-family: "Dancing Script";
  font-size: 2rem;
  font-weight: 700;
  color: #690124;
}

.hover-underline::after,
.hover-underline::before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  background: linear-gradient(to right, #690124, #ffffff);
  bottom: -5px;
  left: 0;
  transform: scaleX(0);
  transform-origin: right;
  transition: transform 0.4s ease-out;
}

.hover-underline::before {
  top: -5px;
  transform-origin: left;
}

.hover-underline:hover::after,
.hover-underline:hover::before {
  transform: scaleX(1);
}

:deep(.btn--no-hover .q-focus-helper) {
  display: none !important;
}
</style>
