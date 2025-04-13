const routes = [
  {
    path: "/",
    component: () => import("layouts/MainLayout.vue"),
    children: [
      {
        path: "home", // Normal path
        name: "HomePage",
        component: () => import("src/pages/MainPage.vue"),
        meta: { title: "Mariza & Dimitri's Wedding" },
      },
      {
        path: "about",
        name: "AboutPage",
        component: () => import("src/pages/AboutPage.vue"),
        meta: { title: "Mariza & Dimitri's Wedding" },
      },
    ],
  },
  // 404
  {
    path: "/:catchAll(.*)*",
    component: () => import("pages/ErrorNotFound.vue"),
  },
];

export default routes;
