/** Supported languages **/

export type Locales = keyof typeof locales;
export const sourceLocale: Locales = "Mode 1";
export const locales = {} as const;