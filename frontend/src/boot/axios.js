import { defineBoot } from "#q-app/wrappers";
import axios from "axios";

const axiosInstance = axios.create({
  baseURL: import.meta.env.VITE_API_BASE_URL,
  headers: { "Content-Type": "application/json" },
});

export default defineBoot(({ app }) => {
  app.config.globalProperties.$axios = axiosInstance;

  app.provide("axios", axiosInstance);
});

export { axiosInstance as axios };
