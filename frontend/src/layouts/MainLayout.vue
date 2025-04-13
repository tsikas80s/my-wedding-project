<template>
  <div class="page-container">
    <div class="snowfall">
      <div v-for="i in 50" :key="i" class="snow" :style="snowStyle(i)">
        &#10052;
      </div>
    </div>
    <q-layout view="lHh Lpr lFf">
      <q-img
        src="~assets/background_2.jpg"
        alt="background image"
        class="fit absolute"
        style="
          object-fit: cover;
          position: fixed;
          top: 0;
          left: 0;
          width: 100%;
          height: 100%;
        "
      />
      <!-- <q-header elevated class="bg-red">
      <q-toolbar>
        <q-btn
          v-if="false"
          flat
          dense
          round
          icon="menu"
          aria-label="Menu"
          @click="toggleLeftDrawer"
        />

        <q-toolbar-title> Test Test</q-toolbar-title>
      </q-toolbar>
    </q-header> -->

      <!-- <q-drawer v-model="leftDrawerOpen" show-if-above bordered>
      <q-list>
        <q-item-label header> Essential Links </q-item-label>

        <EssentialLink
          v-for="link in linksList"
          :key="link.title"
          v-bind="link"
        />
      </q-list>
    </q-drawer> -->
      <q-page-container>
        <router-view />
      </q-page-container>
    </q-layout>
  </div>
</template>

<script setup>
import { ref } from "vue";
const snowStyle = (i) => {
  // Generate random values for each snowflake
  const left = Math.random() * 100;
  const endX = Math.random() * 20 - 10; // Between -10 and 10
  const duration = 8 + Math.random() * 8; // Between 8-16
  const delay = Math.random() * 5 * -1; // Up to 5s delay (negative)

  return {
    left: `${left}vw`,
    "--end-x": `${endX}vw`,
    "animation-duration": `${duration}s`,
    "animation-delay": `${delay}s`,
  };
};

const leftDrawerOpen = ref(false);

function toggleLeftDrawer() {
  leftDrawerOpen.value = !leftDrawerOpen.value;
}
</script>

<style scoped>
.page-container {
  position: relative;
  min-height: 100vh;
}

.snowfall {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 1;
  overflow: hidden;
}

.snow {
  position: absolute;
  color: white;
  font-size: 24px;
  top: -10px;
  animation: snowfall linear infinite;

  /* Different sizes and blur effects */
  &:nth-child(2n) {
    font-size: 16px;
    filter: blur(1px);
  }
  &:nth-child(3n) {
    font-size: 32px;
    filter: blur(0.5px);
  }
  &:nth-child(5n) {
    font-size: 12px;
    filter: blur(2px);
  }
}

@keyframes snowfall {
  0% {
    transform: translate(0, 0);
    opacity: 0;
  }
  10% {
    opacity: 1;
  }
  90% {
    opacity: 1;
  }
  100% {
    transform: translate(var(--end-x), 100vh);
    opacity: 0;
  }
}
</style>
