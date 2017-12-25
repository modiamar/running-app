import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';

import { RunningAppSharedModule, UserRouteAccessService } from './shared';
import { RunningAppAppRoutingModule} from './app-routing.module';
import { RunningAppHomeModule } from './home/home.module';
import { RunningAppAdminModule } from './admin/admin.module';
import { RunningAppAccountModule } from './account/account.module';
import { RunningAppEntityModule } from './entities/entity.module';
import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        RunningAppAppRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        RunningAppSharedModule,
        RunningAppHomeModule,
        RunningAppAdminModule,
        RunningAppAccountModule,
        RunningAppEntityModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class RunningAppAppModule {}
